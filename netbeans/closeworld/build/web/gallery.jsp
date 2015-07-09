<%-- 
    Document   : newjsp
    Created on : Mar 28, 2015, 6:52:51 PM
    Author     : vinay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
	 <link rel="stylesheet" href="css/style_1.css">
	
    </head>
    <body>
       
			
        <!--
        <div class="content-1" style=" ;height:100% ; float:left; position:fixed;">
        
            <div style=" background:red; width:400px;height:400px; float:left;">
           
        </div>
        <div style=" background:blue; width:400px;height:400px; float: left;">
            
            
        </div>
             <div style=" background:green; width:400px;height:400px;float: left;">
            
            
        </div> 
            <div style=" background: slategray; width:400px;height:400px;float: left;">
            
            
        </div>
            
        </div>
        -->
    



	
	<div id="demo" class="showcase">
		<section id="examples">
			
			
                    <div id="content-8" class="content" style=" margin:0px; padding: 0px; position:fixed;width:1000px;height:600px;">
                   <p><img style=" width:400px;height:400px;" src="image/1.jpg" />
                         <img style=" width:400px;height:400px;" src="image/1.jpg" />
                        <img style=" width:400px;height:400px;" src="image/1.jpg" />
			<img style=" width:400px;height:400px;" src="image/1.jpg" />
			<img style=" width:400px;height:400px;" src="image/1.jpg" />
			<img style=" width:400px;height:400px;" src="image/1.jpg" />
			<img style=" width:400px;height:400px;" src="image/1.jpg" />
			 <img style=" width:400px;height:400px;" src="image/1.jpg" /></p>
				</div>
			
			
		</section>
	</div>
	
	
	
	<script>window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')</script>
	
	<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
	
	<script>
	    (function ($) {
	        $(window).load(function () {

	           
	            $("#content-8").mCustomScrollbar({
	                axis: "yx",
	                scrollButtons: { enable: true },
	                theme: "3d",
	                scrollbarPosition: "outside"
	            });

	           
	        });
	    })(jQuery);
	</script>

    
    </body>
</html>
