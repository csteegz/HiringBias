<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Addded {{name}}</title>
    <link rel = "stylesheet" href="../../css/bootstrap.css">
    <link rel = "stylesheet" href="../../css/bootstrap-theme.css">
    <link rel = "stylesheet" href="../../js/jquery-ui.css">
    <link href="../css/bootstrap-tag-cloud.css" rel="stylesheet">
    <script src="../../js/jquery-1.12.3.js"></script>
    <script src="../../js/bootstrap.js" type="application/javascript"></script>
    <script src="../../js/jquery-ui.js"></script>
    <script src="../../js/search.js"></script>
    <link rel="icon" type="image/jpg"
          href="../../images/favicon.jpg" />
    <script>
        $(function() {
            var availableTags = [
                "ActionScript",
                "AppleScript",
                "Asp",
                "BASIC",
                "C",
                "C++",
                "Clojure",
                "COBOL",
                "ColdFusion",
                "Erlang",
                "Fortran",
                "Groovy",
                "Haskell",
                "Java",
                "JavaScript",
                "Lisp",
                "Perl",
                "PHP",
                "Python",
                "Ruby",
                "Scala",
                "Scheme"
            ];
            $( "#search" ).autocomplete({
                source: availableTags
            });
            $("#form").submit(function(ev){
                event.preventDefault();
                console.log(ev);
                SearchJob($("#search").val(),$("#where").val());
            })
        });
    </script>
</head>

<body>
<div class = wrapper>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="../index.html">AnonyJob</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="../apply/landing.html">Apply for a Job</a></li>
                <li><a href="../post/landing.html">Post a Job</a></li>
                <li  class="active"><a href="../resume/landing.html">Add a Resume</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class = "container" id="main">
Created resume {{name}}.
</div>
<div class="push"></div>
</div>
<footer class="footer bg-info">
    <div class="container text-muted text-center">
        <ul class="list-inline text-muted">
            <li><a href="https://github.com/csteegz/HiringBias">GitHub</a></li>
            <li><a href="http://cmsc434-s16.wikispaces.com/TA05+Interactive+Prototype+v1">Asignment Link</a></li>
            <li><a href="../about/index.html">About</a></li>
        </ul>
        <p>
            TA-05 By Colin Versteeg, Sam Price, Jesse Averbukh and TJ Pickeral
        </p>
    </div>
</footer>
<div class="modal fade" id="applyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Apply for <div id="title"></div></h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="resSelect" class="col-sm-2 control-label">Resume</label>
                        <div class="col-sm-5">
                            <select class="form-control" id="resSelect">
                            <option> Resume 1
                            </option>
                                <option>
                                    Resume 2
                                </option>
                                <option>
                                    Resume 3
                                </option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="CLSelect" class="col-sm-2 control-label">Cover Letter</label>
                        <div class="col-sm-5">
                            <select class="form-control" id="CLSelect">
                                <option> Letter 1
                                </option>
                                <option>
                                    Letter 2
                                </option>
                                <option>
                                    Letter 3
                                </option>
                            </select>                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <a href="submit.html" class="btn btn-primary">Apply!</a>
            </div>
        </div>
    </div>
</div>
<script language="JavaScript" src="../js/bootstrap-tag-cloud.js"></script>
</body>
</html>