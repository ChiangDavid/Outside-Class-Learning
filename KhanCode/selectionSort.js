/*	Created By David Chiang on 10/6/15
 *	Constructed Selection Sort, also learning how to write the JavaScript
 *	Learning from the Khan Academy
 */


var swap = function(array, firstIndex, secondIndex) {
    var temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
};

var indexOfMinimum = function(array, startIndex) {

    var minValue = array[startIndex];
    var minIndex = startIndex;

    for(var i = minIndex + 1; i < array.length; i++) {
        if(array[i] < minValue) {
            minIndex = i;
            minValue = array[i];
        }
    } 
    return minIndex;
}; 

var selectionSort = function(array) {
    var smallNumIndex;
    for (var i = 0; i < array.length; i++) {
        smallNumIndex = indexOfMinimum(array,i);
        swap(array,smallNumIndex,i);
    }
};

var array = [22, 11, 99, 88, 9, 7, 42];
selectionSort(array);
println("Array after sorting:  " + array);

Program.assertEqual(array, [7, 9, 11, 22, 42, 88, 99]);

var array1 = [-1, 11, 99, 77, 9, 0, 1];
selectionSort(array1);
println("Array after sorting:  " + array1);
Program.assertEqual(array1, [-1, 0, 1, 9, 11, 77, 99]);