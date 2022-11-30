package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController 
{
	@GetMapping("/course")
	public ResponseEntity<String> getCourseDtls(@RequestParam String name)
	{
		String msg = null;
		if("SBMS".equals(name))
		{
			msg=name+ ">> It will be starating shortly";
		}
		
		else if("DVEOPS".equals(name))
		{
			msg=name+ ">> It will be starating shortly";

		}
		
		else
		{
			msg =name+" >> Contact the IT person for the course details";
		}
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
