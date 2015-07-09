<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<h:html>
<head>
<title>CloseWorlD</title>
<script>
    var digitsOnly = /[1234567890]/g;
function restrictCharacters(myfield, e, restrictionType) {
	if (!e) var e = window.event;
	if (e.keyCode) code = e.keyCode;
	else if (e.which) code = e.which;
	var character = String.fromCharCode(code);
	// if they pressed esc... remove focus from field...
	if (code==27) { this.blur(); return false; }
	// ignore if they are press other keys
	// strange because code: 39 is the down key AND ' key...
	// and DEL also equals .
	if (!e.ctrlKey && code!=9 && code!=8 && code!=36 && code!=37 && code!=38 && (code!=39 || (code==39 && character=="'")) && code!=40) {
		if (character.match(restrictionType)) {
			return true;
		} else {
			return false;
		}
	}
}
</script>
<style type="text/css">
body
{
    margin:0px;
    padding:0px;
    height:100%;
    width:100%;
    
}
.header
{
    height:82px;
    width:100%;
    background:#3a5795;
}
#logo
{ 
    height:100%;
    width:50%;
    float:left;
}
#login
{
    margin-top: 0px;
    padding-top: 0px;
    width:50%;
    height:100%;
    float:left;
}
#c
{
    margin-left: 220px;
    float:left;
    font-size: 50px;
    font-family: Magneto;
    color:whitesmoke;
    cursor:pointer;
    
}
#loseorld
{
    float:left;
    text-decoration: underline;
    font-size: 48px;
    font-family: Monotype Corsiva;
    color:whitesmoke;
     cursor:pointer;
}
#w
{
    float:left;
    margin-top: 10px;
    cursor:pointer;
}
.section
{
    
    height:90%;
    width:100%;
    background:lavender;
    }
    #aim{
        font-size: large;
   
    height:100%;
    width:50%;
    float:left;
   
    }

#quotes
{
    font-size: large;
    
    height:100%;
    width:50%;
    float:left;
}
.footer
{
    height:100px;
    width:100%;
    background:lightsteelblue;
}
.head2{
          text-align: left;
          position: relative;
      }
.head2 input[type="text"],.head2 input[type="password"],.head2 input[type="date"]
   {
       border:.2px solid;
       border-radius:5px;
       color:black;
       padding:7.5px;
       width:100%;
       font-size:20px;
       border:1px solid #3a5795;
       }
       .head2 input[type="text"]:hover,.head2 input[type="submit"]:hover,.head2 input[type="password"]:hover,.head2 input[type="date"]:hover,.head2 input[type="button"]:hover
{
    box-shadow:0 0 2px #000;
    
}
.head2 input[type="text"]:focus ,.head2 input[type="submit"]:focus,.head2 input[type="password"]:focus,.head2 input[type="date"]:focus,.head2 input[type="button"]:focus
{
    
     box-shadow:0 0 2px #000;
}

       
table
    {
      margin-left:80px;
      margin-top:0px;
      margin-right:80px;
      width:450px;
      
    }
td
    {
    font-size:large;
    padding: 5px;
    }
    
input[type="submit"],input[type="button"]{
    width: 50px;
    margin: 10px;
    padding: .27em .63em;
box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
background-color: #3a5795;
color: whitesmoke;
border: 1px solid #000 ;
text-decoration: none;
cursor: pointer;
}

.head2 input[type="submit"],.head2 input[type="button"]{
    width: 200px;
    height:35px;
    margin: 10px;
    padding: 5px;
box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
-moz-box-shadow: 0 2px 1px rgba(0,0,0,0.3),0 1px 0 rgba(255,255,255,0.4) inset;
background-color: #3a5795;
border: 1px solid #000 ;
border-radius:5px;
text-decoration: underline;
cursor: pointer;
}
 input[type="text"], input[type="password"]{
    width: 100%;
    padding: 2px;   
    border: 1px solid #cccccc;
    box-shadow: 0 0 2px whitesmoke;
    
}
input[type="text"]:hover,input[type="submit"]:hover,input[type="password"]:hover,input[type="date"]:hover, input[type="button"]:hover
{
    box-shadow:0 0 2px #000;
    
}
input[type="text"]:focus ,input[type="submit"]:focus,input[type="password"]:focus,input[type="date"]:focus,input[type="button"]:focus
{
    
    border:1px solid #000;
    
}
     
</style>
</head>
<h:javascript formName="loginbean"/>
<h:javascript formName="registerbean"/>
<body>
    <div class="header" >
      <div id="logo"  >
        <br/>
        <div id="c">C</div>
        <div id="loseorld">lose</div>
        <div id="w"><img width="50px" height="50px" src="image/cw3.gif" /></div>
        <div id="loseorld">orld</div>
      </div>
        
<div id="login">
<h:form action="/login" onsubmit="return validateLoginbean(this)">   
<table border="0">
    <tr>
        <td style="color:red;font-family:arial; font-size: small;font-style: italic;"><h:errors/>${requestScope.msg}</td>
    </tr>
<tr>
     <td style="color:whitesmoke;font-family:arial; font-size: small;">Email-Id<h:text  property="user"/></td>
     <td style="color:whitesmoke;font-family:arial; font-size: small;">Password<h:password  property="pass"/></td>
     <td><h:submit value="Log In" /></td>
</tr>
</table>
</h:form>
</div>
</div>
<div class="section">
<div id="aim">
<table>
<tr>
<td colspan=3><center>
<big>Close World Welcomes you !!</big>
<br/>
Plz help me to improve.<br />

</td></tr>


<tr>
<td>Sachin</td>

</tr>
</table>
</div>
<div id="quotes">
<table style="margin-top:0px;">
<tr>
<td colspan="2" style="font-family: Arial; font-size:36px; font-weight: bolder;">Sign up</td>
</tr>
<tr>
<td colspan="2" style="font-family: Arial; font-size:20px;">The future is purchased by the present.</td>
</tr>
</table>
<h:form action="/register" method="post" onsubmit="return validateRegisterbean(this)">
<div class="head2">
<table>
<tr>
<td style="color:red;font-family:arial; font-size: small;font-style: italic;">  <h:errors/>${requestScope.regmsg}</td>
</tr>
<tr>
<td><input type="text" name="fname" placeholder="First name" /></td>
<td><input type="text" name="lname" placeholder="Last name"/></td>
</tr>
<tr>
<td colspan=2><input type="text" name="email" placeholder="Email-ID" /></td>
</tr>
<tr>
<td  colspan=2><input type="password" name="pass" placeholder="Password"  /></td>
</tr>
<tr>
<td  colspan=2><input type="password" name="pass1" placeholder="Re-Enter Password"  /></td>
</tr>
<tr>
<td  colspan=2><input type="text" name="contact" placeholder="Contact Number" id="input1" onkeypress="return restrictCharacters(this, event, digitsOnly);"/></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Sign Up" style="font-weight: bold; font-size: medium;"></td>
</tr>
</table>
    <hr width="75%" align="center"/>
</div>
</h:form>
</div>
</div>
<div class="footer">
    </div>
</body>
</h:html>          