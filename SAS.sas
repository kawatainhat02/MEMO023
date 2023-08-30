data _null_;
    put "Hell" "o World!";
run;

data foo ;
    bar="Hello" ;
    put bar= "World!";
run ;

%let foo=Hello;
%put &foo.o World!;

%let foo=Hello;

data _null_ ;
  put "&foo World!";
run ;
