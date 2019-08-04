package com.techyourchance.unittestingfundamentals.exercise3;

import com.techyourchance.unittestingfundamentals.example3.Interval;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntervalsAdjacencyDetectorTest {

    IntervalsAdjacencyDetector SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new IntervalsAdjacencyDetector();
    }

    // interval 1 is before adjacent interval 2
    @Test
    public void isAdjacent_interval1BeforeInterval2_falseReturned() {
        Interval interval1 = new Interval(-11, -6);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    // interval 1 is before adjacent interval 2
    @Test
    public void isAdjacent_interval1BeforeAdjacentInterval2_trueReturned() {
        Interval interval1 = new Interval(-10, -5);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(true));
    }

    // interval 1 is overlapping interval 2 on start
    @Test
    public void isAdjacent_interval1OverlapInterval2OnStart_falseReturned() {
        Interval interval1 = new Interval(-4, 4);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    // interval 1 is contained within interval 2
    @Test
    public void isAdjacent_interval1IsContainedWithinInterval2_falseReturned() {
        Interval interval1 = new Interval(-4, 4);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    // meme donner
    @Test
    public void isAdjacent_interval1EqualsInterval2_falseReturned() {
        Interval interval1 = new Interval(-5, 5);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    // interval 1 contained interval 2
    @Test
    public void isAdjacent_interval1ContainedInterval2_falseReturned() {
        Interval interval1 = new Interval(-6, 6);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    // interval 1 is overlapping interval 2 on end
    @Test
    public void isAdjacent_interval1OverlapInterval2OnEnd_falseReturned() {
        Interval interval1 = new Interval(-4, 6);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }

    // interval 1 is after adjacent interval 2
    @Test
    public void isAdjacent_interval1AfterAdjacentInterval2_trueReturned() {
        Interval interval1 = new Interval(5, 10);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(true));
    }

    // interval 1 is before adjacent interval 2
    @Test
    public void isAdjacent_interval1AfterInterval2_falseReturned() {
        Interval interval1 = new Interval(6, 11);
        Interval interval2 = new Interval(-5, 5);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }
}