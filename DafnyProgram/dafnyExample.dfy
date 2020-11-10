method findMin(startArray:array<int>, startIndex:int) returns (minValue: int)
requires 0 <= startIndex < startArray.Length-1 
ensures forall j :: startIndex <= j < startArray.Length-1 ==> minValue <= startArray[j]
{
    var i:int := startIndex;
    assert(i==startIndex);
    if (startIndex == startArray.Length-1){
        minValue := startArray[startIndex];
        assert(minValue <= startArray[startIndex]);
    }
    else{
        minValue := startArray[startIndex];
        assert(minValue<= startArray[startIndex]);
        i := i+1;
        while (i < startArray.Length-1)
        invariant (startIndex <= i < startArray.Length)
        invariant forall j :: startIndex <= j < i ==> minValue <= startArray[j]
        decreases startArray.Length-i
        {
            var minTemp:int:= findMinHelper(startArray[i], startArray[i+1]);
            minValue := findMinHelper(minValue, minTemp);
            assert (minValue <= startArray[i] && minValue <= startArray[i+1]);
            i := i+1;
        }
        
    }
}
method findMinHelper(num1: int, num2: int) returns (min: int)
ensures min <= num1 && min <= num2
{
    if(num1 < num2)
    {
        min := num1;
    }
    else {
        min := num2;
    }
}


method Main(){
    var arr := new int[6];
    arr[0], arr[1], arr[2], arr[3], arr[4], arr[5] := 12, 7, 8, 18, 26, 14;
    assert arr.Length > 0;
    var min:int := findMin(arr, 0);
    
    print "The smallest value in the array is ";
    print min;
}