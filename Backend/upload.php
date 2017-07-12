<?php
include("config.php");

$tech=$_POST['tech'];
$img=$_FILES['upload_img']['tmp_name'];
$short_summary=$_POST['short_summary'];
$long_summary=$_POST['long_summary'];
$reference=$_POST['reference'];
$imagetmp=addslashes(file_get_contents($img));				
$sql_insert="INSERT INTO `technology` (`name_tech`, `short_summary`, `long_summary`,`reference`, `tech_image`) VALUES ('$tech','$short_summary','$long_summary','$reference','$imagetmp');";

$sql_exe=mysqli_query($con,$sql_insert) or die("Could not upload");

$sql_fetch="SELECT tech_image from technology where name_tech='$tech';";

$sql_exe=mysqli_query($con,$sql_fetch) or die("Could not upload");
$myfile = fopen("img1.jpg", "w") or die("Unable to open file!");
while($row=mysqli_fetch_array($sql_exe))
{
	//$image_name=$row["name"];
	$image_content=$row["tech_image"];
	fwrite($myfile,$image_content);
	//echo $image_name;
	echo "<br><img src='img1.jpg'><br>";
}
/*
if($stmt==true){
	$msg = 'Successfullly UPloaded';
}else{
	$msg = 'Could not upload';
}
echo $msg;*/
?>