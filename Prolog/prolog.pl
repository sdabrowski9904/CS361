%RoyalFamily
%facts
p(edward7,george5).
p(victoria,edward7).
p(alexandra,george5).
p(george6, elizabeth2).
p(george5, george6).
% A rule
g(X,Y):-p(X,Z),p(Z,Y).

%calculations
% Following represents if (x ==0) return 1 else return 5
f(0,1).
f(X,5):- X>0.
% Following represents g(Y) = 2 * X
g(X,Y) :- Y is 2*X.


%factorial
factorial(0,1).
factorial(N,Result) :-  N>0, M is N-1, factorial(M,SubResult), Result is N*SubResult.

%Fibonacci
Fib(0,1).
Fib(1,1).
Fib(N,R) :- N>1, N1 is N-1, N2 is N-2, fib(N1,R1),fib(N2,R2),R is R1+R2.

%Shape
rectangleperimeter (H,W,P) :- P is 2*H+2*W.
rectanglearea(H,W,A):-A is H*W.

%BNF expressions
%Can represent BNF grammar in prolog using a list of words and rules
s(X,Y):- np(X,U),vp(U,Y).
%Can also be written as:
% s --> np, vp.

sentence --> noun, verb.
noun --> [bees].
noun --> [dog].
verb --> [buzz].
verb --> [bite].

