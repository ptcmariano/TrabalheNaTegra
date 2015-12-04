<?php

/**
* Execao lancada quando nao tem nota disponivel para saque
*/
class NoteUnavailableException extends \Exception
{

}

throw new NoteUnavailableException("notas indisponiveis para esse saque");