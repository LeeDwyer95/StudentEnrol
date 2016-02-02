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

    }
    def destroy = {
    }
}
