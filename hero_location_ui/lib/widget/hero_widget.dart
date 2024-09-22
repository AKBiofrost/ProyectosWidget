import 'package:flutter/material.dart';

class HeroWidget extends StatelessWidget {
  final String tag;
  final Widget child;

  const HeroWidget({
    required this.tag,
    required this.child,
   // required Key key,
  }) : super();

  @override
  Widget build(BuildContext context) => Hero(
        tag: tag,
        child: Material(type: MaterialType.transparency, child: child),
      );
}
