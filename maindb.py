from flask import Flask, request, render_template, url_for
from flask_mysqldb import MySQL
import MySQLdb
from werkzeug.utils import redirect

app = Flask(__name__)
app.secret_key = "123456789"

app.config["MYSQL_HOST"] = "127.0.0.1"
app.config["MYSQL_USER"] = "root"
app.config["MYSQL_PASSWORD"] = "root"
app.config["MYSQL_DB"] = "users"

db = MySQL(app)
eid = ""
uname = ""
comp = ""
eml = ""


def passv(uid, username, company, email):
    global eid
    eid = uid
    global uname
    uname = username
    global comp
    comp = company
    global eml
    eml = email


@app.route('/', methods=['GET', 'POST'])
def profile():
    if request.method == 'POST':
        if "uid" in request.form and "username" in request.form and "email" in request.form and "company" in request.form:
            uid = request.form['uid']
            username = request.form['username']
            company = request.form['company']
            email = request.form['email']
            curs = db.connection.cursor(MySQLdb.cursors.DictCursor)
            curs.execute("INSERT INTO users.userinfo(uid, e_name, company, email) VALUES(%s, %s, %s, %s)",(uid, username, company, email))
            db.connection.commit()
            passv(uid, username, company, email)
            return redirect(url_for('success'))

    return render_template('welcome.html')


@app.route('/success', methods=['GET'])
def success():
    return render_template('success.html', id=eid, uname=uname, company=comp, email=eml)


if __name__ == '__main__':
    app.run(debug=True)
