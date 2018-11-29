<?php 
	require_once('connect.php');
	
	$sql = "SELECT * FROM Gejala";
	
	$r = mysqli_query($con,$sql);
	
	$result = array();
	
	while($row = mysqli_fetch_array($r)){
		
		array_push($result,array(
			"id"=>$row['ID'],
          	"kode"=>$row['Kode'],
			"gejala"=>$row['Gejala'],
          	"range"=>$row['Range'],
          	"bobot"=>$row['Bobot'],
          	"int min"=>$row['Int Min'],
          	"int max"=>$row['Int Max'],
          	"nil mid"=>$row['Nil Mid'],
          	"f min"=>$row['F Min'],
          	"f max"=>$row['F Max'],
          	"f hasil"=>$row['F Hasil']
		));
	}
	
	echo json_encode(array('result'=>$result));
	
	mysqli_close($con);
?>