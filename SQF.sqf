_num = 10;
_num = _num + 20; systemChat str _num;
_num = 10

// put the result of allUnits into a Variable
_unitsArray = allUnits;

// display the current Array size using systemChat
systemChat str count _unitsArray;

// create a new unit in the player group
group player createUnit ["B_RangeMaster_F", getPosATL player, [], 0, "FORM"];

// output the Array size again
systemChat str count _unitsArray;

// output the size of allUnits
systemChat str count allUnits;

count (_arr select 2); 
