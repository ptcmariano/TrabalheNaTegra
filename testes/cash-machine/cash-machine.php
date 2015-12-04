<?php

$valor = isset($argv[1]) ? $argv[1] : null;
if (empty($valor)) {
	var_dump([]);exit();
}
if ($valor < 1) {
	throw new InvalidArgumentException("valor de ser maior que zero");
}

$notasDisponiveis = [100,50,20,10];
$valorRestante = $valor;
$notasEncolhidas = [];

foreach ($notasDisponiveis as $nota) {
	$quantidadeNota = 0;
	while ($valorRestante >= $nota) {
		$quantidadeNota++;
		$diferencaEntreNotaValor = $valor - $nota;
		$valorRestante -= $nota;
	}
	if ($quantidadeNota > 0) {
		$notasEncolhidas[$nota] = $quantidadeNota;
	}
}

if ($valorRestante > 0) {
	require 'NoteUnavailableException.php';
}


var_dump($valorRestante, $notasEncolhidas);
