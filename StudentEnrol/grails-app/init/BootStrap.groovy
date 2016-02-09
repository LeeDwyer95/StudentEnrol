import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
	def course1= new Course(title: 'interactive Media with Animation',
department: 'Computing',
description: '"Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei."',
leader:'Joe Jojo',
code:'IMA101',
startDate:new Date('19/01/2015'),
endDate:new Date('19/01/2020')).save()

def course2= new Course(title: 'computing',
department: 'Computing',
description: '"Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei."',
leader:'Joe Bloggs',
code:'IMA105',
startDate:new Date('19/01/2015'),
endDate:new Date('19/01/2020')).save()


def course3= new Course(title: 'Computer Science',
department: 'Computing',
description: '"Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei."',
leader:'John Smith',
code:'IMA560',
startDate:new Date('19/01/2015'),
endDate:new Date('19/01/2020')).save()

def student1= new Student(
name: 'Sam',
studentid: '1001',
dob:new Date('08/01/1995'),
email: 'sam@hotmail.co.uk',
username: 'sam1',
password: 'samsam1',
course: 'computing').save()

def student2= new Student(
name: 'Louise',
studentid: '2012',
dob:new Date('09/10/1994'),
email: 'louise94@gmail.com',
username: 'lou94',
password: 'loulou',
course: 'computer Science').save()

def Lecturer1=new Lecturer(
name: 'James',
post: 'fssdarfsad',
email: 'jjjames@hotmail.co.uk',
department: 'ACES',
subject: 'computing',
research: 'none').save()

def Lecturer2=new Lecturer(
name: 'Paul',
post: 'fssdarf',
email: 'paulll@hotmail.co.uk',
department: 'ACES',
subject: 'computing',
research: 'none').save()

    }
    def destroy = {
    }
}
