<?php
$id = $_POST["id"];
$name = $_POST["name"];
$state = $_POST["state"];
$village = $_POST["village"];
$message = $_POST["message"];


require "init.php";

	$query = "insert into query(id,name,state,village,message) values('', ' ".$name." ',' ".$state." ',' ".$village." ',' ".$message."');" ;
	$result = mysqli_query($con,$query);	
	
	if(!$result)
	{
		$response = array();
		$code = "Reg_false";
		$message = "Reg failed : Connection error occured !";
		array_push($response,array("code"=>$code,"message"=>$message));
		echo json_encode(array("server_response"=>$response));
	}
	else{	
		$response = array();
		$code = "Reg_true";
		$message = "Registration Successful !";
		array_push($response,array("code"=>$code,"message"=>$message));
		echo json_encode(array("server_response"=>$response));
	}
	mysqli_close($con);	



?>