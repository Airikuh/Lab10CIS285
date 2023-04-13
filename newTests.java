package SelectSort;


import static org.junit.Assert.*;

import org.junit.Test;


public class testSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();


	}

    public testSelectionSort() {
    }
		public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        int[] tempArr = new int[5];
        SelectionSort temp1 = new SelectionSort();
        tempArr = temp1.basicSelectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
        	assertTrue(arr[i] > 0);
        	assertTrue(Sortedarr[i] > 0);
        	assertFalse(arr[i] < 0);
        	assertFalse(Sortedarr[i] < 0);
        }

    }

    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -7;
        Sortedarr[2] = -8;
        Sortedarr[3] = -9;
        Sortedarr[4] = -10;

        /** Test data contains negative values only **/
        int[] tempArr = new int[5];
        SelectionSort temp1 = new SelectionSort();
        tempArr = temp1.basicSelectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
        	assertTrue(arr[i] < 0);
        	assertTrue(Sortedarr[i] < 0);
        	assertFalse(arr[i] > 0);
        	assertFalse(Sortedarr[i] > 0);
        }

    }
}
