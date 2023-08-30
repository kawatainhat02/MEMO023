
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

2+2   //run me by the evaluate code key command with the cursor anywhere on this line - a four should appear in the posting window 

"I am SuperCollider 3".speak	 //run me (Mac only, 3.5 or earlier)

{Pan2.ar(SinOsc.ar(440,0,0.1),0.0)}.play //similarly, concert A sine (works only if server booted)

//one powerful feature of SuperCollider is the ease with which you might bring in interaction: here I substitute a Mouse controller for frequency rather than having a constant
{Pan2.ar(SinOsc.ar(MouseX.kr(440,880),0,0.1),0.0)}.play 
