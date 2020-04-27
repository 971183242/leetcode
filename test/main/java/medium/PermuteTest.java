package main.java.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermuteTest {

    @Test
    public void permute() {
        Permute permute = new Permute();
        int[] nums = {1};
        System.out.println(permute.permute(nums));
    }
}