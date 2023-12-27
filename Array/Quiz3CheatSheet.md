# Quiz 3 Cheat Sheet
## Array
1. Create
    ```java
    datatype[] arrName = new datatype[length of the arr];
    int[] nums = new int[10];
    datatype[] arrName = {foo1, foo2, foo3, ...};
    int[] nums = {1, 2, 3, 4};
    ```
2. Use it 
   ```java
    arrName[index] = foo;
    nums[0] = 20;
    System.out.print(arrName[index]);
    System.out.print(nums[0]);
   ```
3. Important Stuff **#1**
   ```java
    int a;
    a = 10;  // OK
    int[] nums;
    nums = {1, 2, 3, 4};  // NOT OK!
   ```
4. For Each:
   ```java
    for(datatype someName: someArr){
        some stuff using someName(without changing it);
    }
   
    for(int num: nums){
        some stuff using num(without changing it);
    }
    // Important Stuff **#2**
    // !!!replacing and altering num in a for each loop will cause *Error*
   ```
5. `arrName.length` => Length of Arr
6. Important Stuff **#3**
   * If you pass an arr into a function and changed it
   * when you get out of the func
   * It will be **changed** !!! 
7. **VERY IMPORTANT TEMPLATE!!!**
   * directly copy them from this sheet!
   * find min/max
   * ```java
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
     ```
   * find sum/avg
   * ```java
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double avg = (double) sum / nums.length;
        // REMEBER THIS (double) here!!!
        // Now sum holds the sum of all elements and avg holds the average
     ```
   * find some elements with a special property
   * ```java
        ArrayList<Integer> specialElements = new ArrayList<>();

        for (int num : nums) {
            if (num /* some condition, e.g., > specialValue */) {
                specialElements.add(num);
            }
        }
        // Now specialElements contains elements that meet the condition
     ```
   * find if there are repeated elements
   * ```java
        boolean hasRepeated = false;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    hasRepeated = true;
                    break;
                }
            }
            if (hasRepeated) {
                break;
            }
        }
     ```
   * reverse the arr
   * ```java
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        // Now nums holds the reversed array
     ```
   * shift the arr 1 unit to the left/right
   * ```java
        int tmp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = tmp;
        // Now nums holds the array shifted one unit to the left
     
        int tmp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = tmp;
        // Now nums holds the array shifted one unit to the right
     ```
## ArrayList
1. First of all, you need to
   * `import java.util.ArrayList`
2. Create
   * `ArrayList<E> arrLName =new ArrayList<>();`
3. **All the methods** you need about ArrayList:
    ```java
        int size() // get the size
        boolean add(E object) // Add some stuff to the end
        void add(int index, E obj) // add the obj to index
        E get(int index) // get the obj on index
        E set(int index, E obj) // set the obj on index
        E remove(int index) // remove the obj on index
    ```
4. btw, for all the `int index` above
   * add can add to size()
   * get/set/remove can only be size() - 1
5. How to remove specific elements from an ArrayList to ensure a clean removal
   * Do not increment `i` during deletion; increment `i` when not deleting
   * ```java
        for (int i = 0; i < nums.size();) {
            if (some specific condition) {
                nums.remove(i);
            } else {
                i++;  // This approach is also valid, do not increment 'i' in the for loop header
            }
        }
     ```
   * Delete in reverse order
   * ```java
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (some specific condition) {
                nums.remove(i);
            }
        }
     ```
## 2D Arrays
1. It is essentially an array that holds other arrays.
   * Therefore, both accessing elements and making modifications require nested loops.
   * ```java
     int[][] mat = new int[10][10];
     for (int i = 0; i < mat.length; i++) {
         for (int j = 0; j < mat[i].length; j++) {
             System.out.print(mat[i][j] + " ");
         }
         System.out.println();
     }
     ```

## Search & Sort
### Sort (The .gif is very important)
* [Selection Sort](https://sort.hust.cc/2.selectionsort)
```java
for (int i = 0; i < arr.length - 1; i++) {
    int min = i;

    // 每轮需要比较的次数 N-i
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
            // 记录目前能找到的最小值元素的下标
            min = j;
        }
    }

    // 将找到的最小值和i位置所在的值进行交换
    if (i != min) {
        int tmp = arr[i];
        arr[i] = arr[min];
        arr[min] = tmp;
    }
}
```
* [Insertion Sort](https://sort.hust.cc/3.insertionsort)
```java
// 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
for (int i = 1; i < arr.length; i++) {

    // 记录要插入的数据
    int tmp = arr[i];

    // 从已经排序的序列最右边的开始比较，找到比其小的数
    int j = i;
    while (j > 0 && tmp < arr[j - 1]) {
        arr[j] = arr[j - 1];
        j--;
    }

    // 存在比其小的数，插入
    if (j != i) {
        arr[j] = tmp;
    }
}
```
### Search (The .gif is very important)
1. [Binary Search](https://www.cnblogs.com/init-qiancheng/p/14595777.html)
```java
static int binarySearch(int[] arr, int target) {
    int low = 0;  // Initialize the low index
    int high = arr.length - 1;  // Initialize the high index

    while (low <= high) {
        int mid = (low + high) / 2;  // Calculate the middle index

        if (arr[mid] == target) {
            return mid;  // Target element found
        } else if (arr[mid] < target) {
            low = mid + 1;  // Adjust low index for the right half
        } else {
            high = mid - 1;  // Adjust high index for the left half
        }
    }

    return -1;  // Target element not found
}
```
