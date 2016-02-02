package com.studentenrol

class Student {
String name
String studentid
Date dob
String email
String username
String password
String course


String toString(){
"$name,$studentid,$email"
}
    static constraints = {
name()
studentid()
dob()
email()
username maxSize:20
password maxSize:10
course()
    }
}
