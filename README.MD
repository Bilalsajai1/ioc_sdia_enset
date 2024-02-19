<h1>Inversion de contrôle et Injection
des dépendances</h1>
<h4>1- Creation d'Interface IDao : </h4>
<img src="captures/1.jpg">
<h4>2- Implimentation de cette Interface  : </h4>
<img src="captures/2.jpg">
<h4>3- Creation d'Interface IMetier  : </h4>
<img src="captures/3.jpg">
<h4>4- Implimentation de cette Interface  : </h4>
<img src="captures/4.jpg">
<h4>5- Injection des dépendaces   : </h4>
<ol type="a">
  <li value="1">Par instanciation statique :</li>
<br>
<img src="captures/5.jpg">
  <li>Par instanciation dynamique :</li>
<br>
    <img src="captures/6.jpg">
    avec le fichier config.txt est : 
    <img src="captures/7.jpg">
  <li>En utilisant le Framework Spring :
<ul>
<li>Version XML :</li>
<br>
    <img src="captures/8.jpg">
    avec le fichier config.xml est : 
    <img src="captures/9.jpg">
<li>Version annotations :</li>
<br>
    <img src="captures/10.jpg">
    en ajoutent bien sure l'annotation <span style="color: green"> @Repository("dao")</span> sur la class DaoImpl ,
    mème l'annotation <span style="color: green"> @Service("metier")</span> sur la class MetierImpl
</ul>
</li>
</ol>

