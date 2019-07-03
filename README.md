# Creando codigos QR en Java

Imagen_QR_con_url

Si ha visto un recibo, una factura o un poster estos dias seguro ya notó que la
mayoria contiene un código QR que contiene o los datos de su factura/ticket o
un enlace para la app de lo que sea que estan anunciando y bueno si ya son tan
comunes, ¿Que tal si aprendemos a hacerlos?, veamos como.

## ZXing
La libreria ZXing desarollada por Google nos permite tomar una cadena de texto,
codificarla como una matriz de datos la cual luego se puede convertir a un código 
QR con el cual podemos generar una imagen en el formato que necesitemos.

El uso de la libreria es muy sencillo el cual consiste de los siguientes pasos:

1. Crear un objeto QRCodeWriter.
2. Crear una cadena de texto con los datos que deseamos poner en el QR.

https://angelborroy.wordpress.com/2011/09/02/generacion-de-codigos-qr-en-java/
