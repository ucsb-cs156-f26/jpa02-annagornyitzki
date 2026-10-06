package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_for_same_object() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equals_returns_false_for_different_class() {
        assertFalse(team.equals("test-team"));
    }

    @Test
    public void equals_returns_true_for_equal_teams() {
        Team other = new Team("test-team");
        assertTrue(team.equals(other));
    }

    @Test
    public void equals_returns_false_for_different_names() {
        Team other = new Team("other-team");
        assertFalse(team.equals(other));
    }

    @Test
    public void equals_returns_false_for_different_members() {
        Team other = new Team("test-team");
        other.addMember("member");
        assertFalse(team.equals(other));
    }

    @Test
    public void hashCode_returns_expected_value() {
        Team other = new Team("foo");
        other.addMember("bar");
        assertEquals(130294, other.hashCode());
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
