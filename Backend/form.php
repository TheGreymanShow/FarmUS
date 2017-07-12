<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Admin Panal</title>
		<link rel="stylesheet" type="text/css" href="view.css" media="all">
		<script type="text/javascript" src="view.js"></script>
	</head>
	<body id="main_body" >
		
		<img id="top" src="top.png" alt="">
		<div id="form_container">
		
			<h1><a>Admin Panal</a></h1>
			<form id="form_8860" class="appnitro" enctype="multipart/form-data" method="post" action="upload.php">
				<div class="form_description">
					<h2>Admin Panal</h2>
					<p>This panel is to enter new technologies related to farming</p>
				</div>						
				<ul>
					<li id="li_1" >
						<label class="description" for="element_1">Techonlogy name </label>
						<div>
							<input id="element_1" name="tech" class="element text medium" type="text" maxlength="255" value=""/> 
						</div><p class="guidelines" id="guide_1"><small>Enter name of technology here.</small></p> 
					</li>
					<li id="li_3" >
						<label class="description" for="element_3">Upload related image </label>
						<div>
							<input id="element_3" name="upload_img" class="element file" type="file"/> 
						</div> <p class="guidelines" id="guide_3"><small>One image related to technology should be uploaded here </small></p> 
					</li>
					<li id="li_5" >
						<label class="description" for="element_5">Short Summary  </label>
						<div>
							<textarea id="element_5" name="short_summary" class="element textarea medium"></textarea> 
						</div><p class="guidelines" id="guide_5"><small>One or two lines related to technology. It should be like short description related to that technology should be entered here.</small></p> 
					</li>
					<li id="li_2" >
						<label class="description" for="element_2">Detailed Description </label>
						<div>
							<textarea id="element_2" name="long_summary" class="element textarea medium"></textarea> 
						</div><p class="guidelines" id="guide_2"><small>Enter detailed description/information related to that technology here.</small></p> 
					</li>	
					<li id="li_4" >
						<label class="description" for="element_4">Reference  </label>
						<div>
							<input id="element_4" name="reference" class="element text large" type="text" maxlength="255" value="http://"/> 
						</div><p class="guidelines" id="guide_4"><small>Links for more information should be entered here</small></p> 
					</li>
			
					<li class="buttons">
						<input type="hidden" name="form_id" value="8860" />
					
						<input id="saveForm" class="button_text" type="submit" name="submit" value="Submit" />
					</li>
				</ul>
			</form>	
		</div>
		<img id="bottom" src="bottom.png" alt="">
	</body>
</html>