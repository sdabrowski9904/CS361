3;
1+3;
1*2;
1.2;
not(true);
(*1+2.1; does not work due to mismatch of types*)
1.0+2.1;
(*1/3; does not work because start with int and end with real*)
true andalso false;
open Math;
sqrt(2.0);
(*sqrt(2); type error*)
"Iamastring";
fun f(x) = x+1;
fun f(x:real) = 2;
fun f(x:int) = x > 2;
fun max(x:int,y:int,z:int) =
if ((x>y) andalso (x>z)) then x
else (if (y>z) then y else z);
max(3,3,2);
fun fact(n) = if n = 0 then 1 else n * fact(n-1);
fact(5);
val t = (1,2,3);
val t1 = (1.0,2,true,"s");
#1(t); (*returns position 1 of the tuple t*)
(*#7(t); would give out of bounds error*)
[1,2,3,4]; (*list in SML*)
[[1,2],[2]];
[]; (*empty list with generic type 'a *)
nil;
hd[1,2,3]; (*gives head of list 1*)
tl[1,2,3]; (*gives tail of list 2,3*)
1::[1,2,3];(*adds 1 to front of list*)
[1,2,3] @ [7,8]; (*concat*)
1 = 2;
true = true;
"abc" = "abc";
(*1.2 = 1.2; cannot compare real value equality*)
(*Should use |x-y| < epsilon*)
1;
1.0;
(1.0,2.0);
fun f(x:int) = 2.0;
fun f((x:int,y:int)) = x>y;
fun fib(x) = if x=0 orelse x=1 then 1 else fib(x-1) + fib(x-2);
fib(33);
fun fib 0 = 1 | fib 1 = 1 | fib n = fib(n-1) + fib(n-2);
val mylist = [1,7,3,4];
val h = hd mylist;
val t= tl mylist;
