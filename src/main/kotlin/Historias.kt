package org.practicatrim2

enum class Historia(val desc:Map<String,String>) {

    Maldicion( mapOf(
        "Inicio" to "Tras entrar en una misteriosa habitación, descubres que estás bajo una antigua maldición.\nLa única manera de romper el hechizo y liberarte es resolver una serie de enigmas que revelarán el nombre del hechicero responsable.\n ¡El tiempo corre y solo los más astutos escaparán antes de que la maldición sea permanente!",
        "Intermedio" to "Después de resolver los primeros enigmas, te das cuenta de que has descubierto la mitad del hechizo.\nLa habitación comienza a temblar, y un reloj misterioso empieza a contar hacia atrás.\n Ahora, te enfrentas a desafíos aún más difíciles para completar el conjuro y liberarte antes de que el tiempo se agote.\nEl susurro de la maldición se intensifica, y solo una mente rápida podrá desentrañar el enigma final y escapar de la oscura influencia que amenaza con atraparte para siempre.",
        "Final" to  "Con ingenio y determinación, logras completar el hechizo justo a tiempo.\n La habitación se llena de una luz deslumbrante, y sientes cómo la maldición se disipa lentamente.\n La presión en el aire desaparece, y la puerta se abre revelando el camino hacia la libertad. Has vencido al hechizo y desentrañado el misterio. "
        )
    ),
    Nave( mapOf(
        "Inicio" to "Despiertas en una nave espacial a la deriva, con sistemas dañados y oxígeno agotándose.\nPara restablecer la energía y evitar un desastre, debes descifrar códigos y encontrar pistas en las diferentes secciones de la nave.\n¡El destino del viaje espacial está en tus manos, y solo una mente ágil puede desbloquear la salida!\n",
        "Intermedio" to "Después de superar el primer desafío, te encuentras frente a un panel de control encriptado en el que debes ingresar un código numérico para restaurar la energía de la nave.\nLa pista para descifrar el código está oculta en las estrellas que parpadean en la pantalla.\nTras resolver el enigma estelar, introduces el código y sientes cómo la nave cobra vida.\nSin embargo, el tiempo sigue siendo tu enemigo mientras avanzas hacia la siguiente sala, donde te esperan más secretos del cosmos por descubrir.\n¡La travesía espacial continúa!\nAl avanzar por la nave, enfrentas el último desafío: un código numérico de seis dígitos necesario para abrir la compuerta que conduce a la libertad.\nLa clave está vinculada a la alineación de planetas, y debes resolver una serie de ecuaciones astronómicas para obtener los números correctos.",
        "Final" to  "Con cada dígito correcto, sientes cómo la presión se alivia y el camino hacia la salida se despeja.\nCon el código completo, la compuerta se abre, revelando la vastedad del espacio exterior.\nHas triunfado sobre los misterios cósmicos y ganado tu libertad en esta inolvidable odisea espacial.\n¡La aventura llega a su conclusión mientras abandonas la nave y regresas a la realidad!\n"
        )
    ),
    Laboratorio( mapOf(
        "Inicio" to "Te encuentras encerrado en un laboratorio secreto donde se desarrollan experimentos peligrosos.\nPara escapar, debes descubrir la fórmula de un suero experimental que abrirá la puerta de salida.\nSin embargo, cada error activa dispositivos de seguridad y acelera un contador regresivo.\n¿Lograrás desentrañar el secreto antes de que sea demasiado tarde?",
        "Intermedio" to "Tras resolver los enigmas del primer nivel del laboratorio, te enfrentas a una sala con dispositivos científicos que emiten extrañas señales.\nCon la información reunida, avanzas hacia nuevas incógnitas y peligros.\nEl tiempo es esencial, ¡y cada destello te acerca un paso más a la resolución final del misterio en el intrigante laboratorio!",
        "Final" to  "Tras superar las complejas pruebas del laboratorio, llegas a la sala central donde se encuentra el suero experimental.\nAhora, debes combinar los elementos clave revelados por cada enigma para descifrar la fórmula exacta y desbloquear el acceso a la salida.\nCon la fórmula correcta en tus manos, preparas el suero y observas cómo se abre la puerta de salida.\nHas eludido los peligros del laboratorio y revelado sus secretos más oscuros.\nLa puerta se abre, y sales victorioso, dejando atrás un misterio resuelto y la sensación de haber desafiado la ciencia en una emocionante escapada."
    )
    )
}