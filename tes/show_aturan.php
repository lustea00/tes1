<?php 
	$gejala = $_GET['gejala'];
	
	require_once('connect.php');
	
	$sql = "SELECT * FROM Aturan WHERE Gejala='$gejala'";
	
	//Mendapatkan Hasil 
	$r = mysqli_query($con,$sql);
	
	//Memasukkan Hasil Kedalam Array
	$result = array();
	$row = mysqli_fetch_array($r);
	array_push($result,array(
			"id"=>$row['ID'],
			"gejala"=>$row['Gejala'],
          	"penyakit"=>$row['Penyakit']
		));
 
	//Menampilkan dalam format JSON
	echo json_encode(array('result'=>$result));
	
	mysqli_close($con);
?>