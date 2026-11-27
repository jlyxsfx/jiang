// Aufgabe 3a:
int[] reverseArray(int[] numbers){
    if (numbers != null){
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            reversed[i] = numbers[i];
        }
        for (int i = 0; i < reversed.length / 2; i++){
            int next = reversed[reversed.length - 1 - i];
            reversed[reversed.length - 1 - i] = reversed[i];
            reversed[i] = next;
        }
        return reversed;
    }
    return null;
}

// Aufgabe 3b:
int[] filterEven(int[] numbers){
    if (numbers == null || numbers.length == 0){
        return new int[0];
    }
    if (numbers.length > 0){
        int count = 0;
        for (int num : numbers){
            if (num % 2 != 0){
                continue;
            }
            count++;
        }
        int[] even = new int[count];
        int index = 0;
        for (int num : numbers){
            if (num % 2 == 0){
                even[index] = num;
                index++;
            }
        }
        return even;
    }
    return null;
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

void printResult(String label, int[] array){
    IO.print(label);
    if (array == null){
        IO.print("null");
    } else if (array.length == 0){
        IO.print("{}");
    } else {
        printArray(array);
    }
}

void main(){
    // Augabe 3c:
    int[][] arrays = {
        {1, 2, 3, 4},
        null,
        {}
    };
    for (int[] arr : arrays){
        printResult("Eingabe:       ", arr);
        printResult("reverseArray:  ", reverseArray(arr));
        printResult("filterEven:    ", filterEven(arr));
    }
}