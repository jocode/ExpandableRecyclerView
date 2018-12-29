# ExpandableRecyclerView

Este es un ejemplo de cómoo relizar una lista expandible, usando RecyclerView en Android.

Para ello, usaremos la librería [Expandable RecyclerView](https://github.com/thoughtbot/expandable-recycler-view) de *thoughtbot*.


1. Agregamos las dependencias al archivo gradle.
```
implementation 'com.thoughtbot:expandablerecyclerview:1.3'
implementation 'com.android.support:recyclerview-v7:28.0.0'
```

2. Creamos el Layout para el título del grupo
3. Creamos el Layout para el subItem
4. Creamos el modelo para el grupo y para los items del grupo 
5. Creamos el ViewHolder del grupo
6. Creamos el ViewHolder del hijo
7. Creamos el adaptador
8. Creamos el Layout de la actividad
9. Instanciamos la vista y creamos los los datos para definir el adaptador y mostrarlos en el ExpandableRecyclerView
10. Agregamos las flechas y la animación de la misma al expandir el grupo

*La animación del ítem se definió en el ViewHolder del grupo* Para más información, ver la documentación de la librería.