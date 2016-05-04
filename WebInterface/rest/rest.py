__author__ = 'Colin Versteeg'
from bottle import run,template,route, request


@route("/WebInterface/upload", method = "POST")
@route("/WebInterface/form" , method = "POST")
def added():
    name = request.forms.get('name')
    return template("done", name=name)

run(host='localhost', port=80)
