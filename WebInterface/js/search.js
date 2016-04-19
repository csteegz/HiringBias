/**
 * Created by Colin on 4/18/2016.
 */

//http://stackoverflow.com/questions/610406/javascript-equivalent-to-printf-string-format
if (!String.prototype.format) {
    String.prototype.format = function() {
        var args = arguments;
        return this.replace(/{(\d+)}/g, function(match, number) {
            return typeof args[number] != 'undefined'
                ? args[number]
                : match
                ;
        });
    };
}

// Defaults for Indeed API
apiKey = "1656832256563038";
version = "2";
format = "json";
cback = "buildResults";
cityDefault = "College Park, MD";

//Github API
searchURL = "https://jobs.github.com/positions.json?callback=?";


function SearchJob(Description,Location) {
    jQuery.getJSON(searchURL,{description:Description,location:Location}).done(updateJobs);
}

//Based off this tutorial http://jcla1.com/blog/javascript-mapreduce/
function buildRow(element,index,context){
return '<tr class = "clickable-row" data-url="' + index + '"><th>'+(index+1)+'</th><td>' + element.title + '</td><td>'+element.company+'</td><td>'+element.location+'</td></tr>';
}

//http://stackoverflow.com/questions/17147821/how-to-make-a-whole-row-in-a-table-clickable-as-a-link


function updateJobs(data){
    tableHeader = '<table class = "table table-condensed table-hover"><tr><th>#</th><th>Title</th><th>Company</th><th>Location</th></tr>';
    tableFooter = '</table>';
    newTable = tableHeader + data.map(buildRow).join(" ") + tableFooter;
    $('#results').html(newTable);
    $(".clickable-row").click( function () {
        url = $(this).data("url");
        doSingleJob(data,url);
    });
}

function doSingleJob(arr,index) {
    var data = arr[index]
    console.log(data);

    var horrificHack = '<div class="page-header">\
        <h1> <div id ="title">'+data.title+'</div><small><div id="location">'+data.location+'</div></small></h1>\
        </div>\
        <div class = "col-md-8">\
        <div class="panel panel-default">\
        <div class="panel-heading">\
        <h3 class="panel-title">Description</h3>\
        </div>\
        <div class="panel-body" id="Description">'+data.description+
        '</div>\
    </div>\
    </div>\
    <div class = "pull-right col-md-3">\
        <div class="thumbnail">\
        <img src=' +data.company_logo + ' alt="Company Logo" id="company_logo">\
        <div class="caption">\
        <h3 id="company_name"> <a href='+data.company_url+'>'+data.company+'</a></h3>\
    <p id="company_description"></p>\
        <p><button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#applyModal">Apply Now!</button></p>\
    </div>\
    </div>\
    </div>\
    <div class = "col-md-8">\
        <div class="panel panel-default">\
        <div class="panel-heading">\
        <h3 class="panel-title">Tags</h3>\
        </div>\
        <div class="panel-body" id="Tags"> \
        <ul id="tag-cloud"><li class="tag-cloud">Programming</li> <li class="tag-cloud">Software</li></ul> \
    </div> \
    </div> \
    </div> \
    </div> \
    <div class="push"></div>';

    $('#main').html(horrificHack);
    $('#title').html(data.title);
}