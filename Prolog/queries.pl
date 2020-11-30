%RoyalFamily queries
p (edward7, george5). %Asks Prolog if this is a fact
p (X, george5). % Asks Prolog who parents of george5 are
g(X,Y). %Asks prolog to list for what x and y this rule is true


%calculations queries
f(0, X).
f(1, X).
g(5,Y).
g(3,Y).

%factorial queries
factorial(5, X).
factorial(2, X).
factorial(6, X).

%Fibonacci queries
Fib(0,X).
Fib(6,X).
Fib(9,X).
Fib(12,X).

%list queries
%following are all queries and do not need any program because the functions are predefined
append([1,2], [6,7], X).
length([2,5,7,8,5], Output).
reverse([1,3,5,7], X).
member(5, [2,5,7]). %returns true or false depending if 5 is in the list or not

%shape queries
rectangleperimeter(10, 12, X).
rectanglearea(10,12,Y).

%BNF query
%query for all valid sentences with:
sentence(X,[]).
