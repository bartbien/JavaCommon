package collection.arrays;

import java.util.Arrays;

public class ArrayDimentionsExample
{
	public static void integerArray()
	{
		int[] test = new int[2];

		int[] arrTest =
		{ 1, 2 };

		int[][] arrTest2 =
		{
		{ 1, 2 },
		{ 3, 4 } };

		System.out.println(arrTest2);
		System.out.println(arrTest2[0]);
		System.out.println(arrTest2[1]);

		System.out.println(arrTest2[0][0]);
		System.out.println(arrTest2[0][1]);
		System.out.println(arrTest2[1][0]);
		System.out.println(arrTest2[1][1]);
	}

	public static void doubleArray()
	{
		double[] arrDbTest =
		{ 2, 3 };
		System.out.println(arrDbTest);

		System.out.println(arrDbTest);
	}

	public static void stringArray()
	{
		String[] stringArray =
		{ "str1", "str2" };

		System.out.println(stringArray);

		System.out.println(stringArray);

		String[][] stringArray2 = new String[][]
		{
		{ "X0", "Y0" },
		{ "X1", "Y1" },
		{ "X2", "Y2" },
		{ "X3", "Y3" },
		{ "X4", "Y4" } };
	}

	public static void twoDimentionalArray()
	{
		int[][] arrTest =
		{
		{ 1, 2 },
		{ 3, 4, 5 } };

		// tests of length
		int length = arrTest.length;
		int firstRow = arrTest[0].length;
		int secondRow = arrTest[1].length;

		// print it in iterative way
		for (int i = 0; i < arrTest.length; i++)
		{
			for (int j = 0; j < arrTest[i].length; j++)
			{
				System.out.println(arrTest[i][j]);
			}
		}
	}

	public static void threeDimentionalArray()
	{
		// int[][][] arrTest =
		// {
		// { 1, 2 },
		// { 3, 4, 5 },
		// { 2, 3 } };

		int[][][] threeDimArr =
		{
			{
				{ 1, 2 },
				{ 3, 4 } 
			},
			
			{
				{ 5, 6 },
				{ 7, 8 } 
			} 
		};
		
		int x = threeDimArr[1][0][1];
		int[][] row0 = threeDimArr[0];
		int[][] row1 = threeDimArr[0];
		
		int[][][] copyOfArr = threeDimArr;
		
	    String str = Arrays.deepToString(threeDimArr);
	    System.out.println(str);
	}
	
	public static void multiDimentionalArray()
	{
		int[][][] arr = 
			{
				{
					{ 0, 1, 3},
					{ 4, 5, 6}
				},
				
				{
					{7, 8, 9},
					{10, 11, 12}
				}
			};
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				for (int k = 0; k < arr[i][j].length; k++)
				{
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}
	
	public static void fourDimentionalArray()
	{
		int arr[][][][] = 
			{
				{
					{
						{0, 1},
						{2, 3}
					},
					{
						{4, 5},
						{6, 7}
					}
				},
				{
					{
						{8, 9},
						{10, 11}
					},
					{
						{12, 13},
						{14, 15}
					}
				}
			};
		
		int[] arrTest = arr[0][0][0];
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				for (int k = 0; k < arr[i][j].length; k++)
				{
					for (int l = 0; l < arr[i][j][k].length; l++)
					{
						System.out.println(arr[i][j][k][l]);
					}
				}
			}
		}
	}
	
	public static void fiveDimentionalArray()
	{
		int arr[][][][][] = 
			{
				{
					{
						{
							{0, 1, 111},
							{2, 3, 111}
						},
						{
							{4, 5},
							{6, 7}
						}
					},
					{
						{
							{8, 9},
							{10, 11}
						},
						{
							{12, 13},
							{14, 15}
						}
					}
				},
				{
					{
						{
							{16, 17},
							{18, 19}
						},
						{
							{20, 21},
							{22, 23}
						}
					},
					{
						{
							{24, 25},
							{26, 27}
						},
						{
							{28, 29},
							{30, 31}
						}
					}
				}
			};
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				for (int k = 0; k < arr[i][j].length; k++)
				{
					for (int l = 0; l < arr[i][j][k].length; l++)
					{
						for (int m = 0; m < arr[i][j][k][l].length; m++)
						{
							System.out.println(arr[i][j][k][l][m]);
						}
					}
				}
			}
		}
	}

	public static void main(String args[])
	{
		fiveDimentionalArray();
	}
}
