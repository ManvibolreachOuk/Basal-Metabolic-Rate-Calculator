function Compute()
{
var age=Number(document.getElementById("age").value);
var height=Number(document.getElementById("height").value);
var weight=Number(document.getElementById("weight").value);

var l;
if (document.getElementById('Se').checked)
{
l=1.2;
}
else if(document.getElementById('Li').checked)
{
l=1.375;
} else if(document.getElementById('Mo').checked)
{
l=1.55;
} else if(document.getElementById('Ve').checked)
{
l=1.725;
} else if(document.getElementById('Su').checked)
{
l=1.9;
}

var bmr;
if (document.getElementById('male').checked)
{
bmr=10*weight+6.25*height-5*age+5;
}
else if(document.getElementById('female').checked)
{
bmr=10*weight+6.25*height-5*age-161;
}
bmr=bmr*l;
document.getElementById("output").innerHTML=bmr+" kcal/day";
}