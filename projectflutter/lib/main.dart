import 'package:flutter/material.dart'; //(1)

void main() => runApp(MyApp()); //(3)
class MyApp extends StatelessWidget { //(5)
  // This widget is the root of your application.
  @override // //(7)
  Widget build (BuildContext context) {
    return MaterialApp(
      title: 'Hello World Demo Application',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ), // Theme Data
      home: MyHomePage(title: 'Ma page d\'accueil'),
    ); // MaterialApp
  }
}// (17)
class MyHomePage extends StatelessWidget {
  //(18)
  MyHomePage({ Key? key, required this.title}) : super (key: key); // (19)
  final String title;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(this.title),
      ), // AppBar
      body: Center(
          child:
          Text(
            'Ma première application Flutter!',
          )
      ),
    );
  }
} // (36)