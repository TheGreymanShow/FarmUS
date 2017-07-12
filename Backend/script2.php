<?php 
		
	$connection = mysqli_connect("localhost","root","","farmus");
	$id = $_GET["id"];
	$query = "Select * from schemes where id between ($id+1) and ($id+5)";
	// $query = "Select * from temp;

	
	$result = mysqli_query($connection,$query);
	while ($row = mysqli_fetch_assoc($result)) {
			
		$array[] = $row;
	}
	header('Content-Type:Application/json');
	echo json_encode($array);
  
 ?>