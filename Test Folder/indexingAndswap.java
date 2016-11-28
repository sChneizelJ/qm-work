 /*This is a method of bubble sorting however this also maintains the indicse of the original and the position swaps accorgingly hence its easier to impliment*/
 
  public static Integer [] SortWithIndex(float[] data, Integer [] index)
    {
		  int len = data.length;
		  float temp1[] = new float[len];
		  int temp2[] = new int[len];



      	for (int i = 0; i <len; i++) {


            for (int j = i + 1; j < len; j++) {


                	if(data[i]>data[j])
                  {
                    temp1[i] = data[i];
                    data[i] = data[j];
                    data[j] = temp1[i];



                    temp2[i] = index[i];
                    index[i] = index[j];
                    index[j] = temp2[i];

                    }
                  }

        }

        return index;

    }
