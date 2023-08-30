
// run this line
a = Pbind.new.play(quant:1.0);

a.stop;		// Or stop it with cmd+period; 

// now run this line
Pbind(\freq, 440).play(quant:1.0);

// run this, go back and run some of the others at the same time
(
Pbind(
	\dur,0.125,
	\midinote, Pseq([0, 4, 0, 7, 4, 0, 0] + 60,inf), 
	\amp, Prand([0.125, 0.2, 0.25],inf)
).play(quant:1.0)
)
