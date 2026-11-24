// Aufgabe 3a:
int[] reverseArray(int[] numbers){
    if (numbers != null){
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            result[numbers.length -1 - i] = numbers[i];
        }
        return result;
    }
    return null;
}

// Aufgabe 3b:
int[] filterEven(int[] numbers){
    if (numbers == null || numbers.length == 0){
        return new int[0];
    }
    int[] result = new int[countEven(numbers)];
    int j = 0;
    for (int i = 0; i < numbers.length; i++){
        if (numbers[i] % 2 == 0){
            result[j] = numbers[i];
            j++;
        }
    }
    return result;
}

void printArray(int[] array){
    if (array == null){
        return;
    }
    for (int i = 0; i < array.length; ++i){
        IO.print(array[i]);
        IO.print(i == array.length - 1 ? "\n" : ", ");
    }
}

int countEven(int[] array){
    int count = 0;
    for (int num : array){
        if (num % 2 == 0){
            count++;
        }
    }
    return count;
}

void main(){
    // Augabe 3c:
    int[][] arrays = {
        {1, 2, 3, 4},
        null,
        {}
    };
    for (int[] arr : arrays){
        IO.print("Original: ");
        printArray(arr);
        IO.print("reverseArray: ");
        printArray(reverseArray(arr));
        IO.print("filterEven: ");
        printArray(filterEven(arr));
    }
}