
<body id="body">
<center>
${message}
<form>
<h2 id="headtag">
Welcome to suraj Informatics pvt ltd...
</h2>
<p>Username</p>
<input type="text" name="username" placeholder="enter your username" id="chandr"><br>
<p>Name</p>
<input type="text" name="name" placeholder="enter your name" id="chandr"><br>

<p>Email</p>
<input type="email" name="email" placeholder="enter your email" id="chandr"><br>
<p>Password</p>
<input type="password" name="password" placeholder="Enter Password" id="chandr" ><br><br>
<select> 
<option>select</option>
<option>suraj Informatics Branch 1</option>
<option>suraj Informatics Branch 2</option>
</select>


<br><br>
<input type=submit value="register" formmethod="post" formaction="SaveData">


<input type="submit" value="login" formaction="login-page" formmethod="post">




</form>
</center>
</body>
<style>

#headtag{
 color: green;
 font-size : 50px;
 text-align: sans-sarif;
 


}
#body{
background : #ffffcc

;
}
#chandr{
border-radius:4px;
}

</style>