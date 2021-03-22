/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
//import info5100.university.example.analytics.CourseAnalytics;
import info5100.university.example.analytics.CourseRating;
import info5100.university.example.analytics.FacultyRating;
import info5100.university.example.faker.FakerFactoryDemo;
import java.util.List;

/**
 *
 * @author truptiraut
 */
public class University {
    public static void main(String[] args) {
        Department dept = FakerFactoryDemo.getDepartment();
        CourseRating  ca = new CourseRating(dept);
        
        //Will display the faculty rating
        FacultyRating fa = new FacultyRating(dept);
        int facultyrating = fa.getFacultyRating(dept.getFacultydirectory().getTeacherlist().get(0));
        System.out.println("Faculty rating of the university is: "+facultyrating);
        
        //will display the top courses according to industry standards
        List<Course> topJobCourses = ca.getTopJobCourses(1, "Spring2021");
        System.out.println(" This are all the top Courses according to Industry Standards is: ");
        topJobCourses.stream().forEach(s -> System.out.println(s.getCOurseNumber()));
        
        //will give the course rating according to jobs in industry
        String CourseName = dept.getCourseCatalog().getCourseList().get(0).getName();
        int rating = ca.getJobCourseRating(CourseName);
        System.out.println("The course rating done as per Industry Standards is: "+rating);
        
        //Will give the average salary growth of the course
        double growthSalary = ca.getCourseSalaryGrowthRatingForCourse(CourseName);
        System.out.println("The Average Salary Growth for the Course is: "+growthSalary);
         
        
         
    }
}
