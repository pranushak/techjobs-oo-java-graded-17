package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.testng.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job = new Job();
        Job job1 = new Job();
        assertNotEquals(job.getId(), job1.getId());
    }

    @Test
    public void  testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester",job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(false, job.equals(job1));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job = new Job();
        String actual = job.toString();
        System.out.println(actual);
        String expected = System.lineSeparator() + "ID: "+ job.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();
        assertEquals(actual,expected);
    }
    
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String actual=job.toString();
        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() +
                "Name: " + job.getName() + System.lineSeparator() +
                "Employer: " + job.getEmployer() + System.lineSeparator() +
                "Location: "+ job.getLocation() + System.lineSeparator() +
                "Position Type: " + job.getPositionType() + System.lineSeparator() +
                "Core Competency: " + job.getCoreCompetency() + System.lineSeparator();
        assertEquals(actual,expected);
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job();
        String actual = job.toString();
        String expected = System.lineSeparator() + "ID: " + job.getId() + System.lineSeparator() +
                "Name: " +  "Data not available" + System.lineSeparator() +
                "Employer: " + "Data not available" + System.lineSeparator() +
                "Location: "+ "Data not available" + System.lineSeparator() +
                "Position Type: " + "Data not available" + System.lineSeparator() +
                "Core Competency: " + "Data not available" + System.lineSeparator();
        assertEquals(actual,expected);
    }
}
