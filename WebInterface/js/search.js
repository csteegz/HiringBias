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
positionURL = "https://jobs.github.com/positions/{0}.json"

function SearchJob(Description,Location) {
    console.log(Description);
    console.log(Location);
    jQuery.getJSON(searchURL,{description:Description,location:Location}).done(updateJobs);
}

//Based off this tutorial http://jcla1.com/blog/javascript-mapreduce/
function buildRow(element,index,context){
return '<tr class = "clickable-row" data-url="../index.html?id='+element.id+'"><th>'+(index+1)+'</th><td>' + element.title + '</td><td>'+element.company+'</td><td>'+element.location+'</td></tr>';
}

//http://stackoverflow.com/questions/17147821/how-to-make-a-whole-row-in-a-table-clickable-as-a-link


function updateJobs(data){
    tableHeader = '<table class = "table table-condensed table-hover"><tr><th>#</th><th>Title</th><th>Company</th><th>Location</th></tr>';
    tableFooter = '</table>'
    newTable = tableHeader + data.map(buildRow).join(" ") + tableFooter;
    $('#results').html(newTable);
    $(".clickable-row").click( function () {
        url = $(this).data("url");
        console.log(url);
        window.location = url;
    });
}