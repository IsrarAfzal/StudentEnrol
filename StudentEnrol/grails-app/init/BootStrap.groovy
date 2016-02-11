import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->
	def course1=new Course( title: 'Interactive Media and Animation',
		department: 'Computing',
		
		description: '''Lorem Ipsum dolor sit amet, ad seas solum brute sensibus, te summo senerit vix, mel reque corpora vulputate ei.''',

		leader: 'Joe Jojo',

		code: 'IMA101',

		startDate: new Date('19/01/2015'),

		endDate: new Date('19/10/2020')).save()


    }
    def destroy = {
    }
}
