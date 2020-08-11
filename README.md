
# ArcPointer
__Simple customized progress bar in the form of an arch__

![thumbnail](https://psv4.userapi.com/c848324/u174628862/docs/d1/cb89a7022161/arc.png?extra=sOoPwWgH91RwMkKD5Y1ZkKNSLS4S-LUe-FHleEvaq4KtycqbFJNyz0ziBwiKeJfb5BeGrHz9G5NKdb4GLBwkURkDZYGhec0Y1BJcNQZDKjF6B-Tx-UrPuojFMDt-MfF0u-jRXT8wI-wPHnB5OS5iKtaA)
## Demo
![gif animation](https://psv4.userapi.com/c848324/u174628862/docs/d9/37c019aad53b/arcpointer_demo.gif?extra=00ZAC50144PSJAwEgV2IXMhDjOoRkNIn9Ll7Q8-FQzSPaTVJSuHSMxn5vmiw4oHABT4B_c2t9oBVvONAiiDro1O3UDjPADgiLgKJuoM5xLEuGtoQuSFz66v9H2tdRAdRXemmSD9iLDNmKkn1uP9ixrT6)
## Quick start
### Step 1
Gradle:
```
compile 'io.github.dvegasa:arcpointer:1.0.2'
```

Maven:
```
<dependency>
  <groupId>io.github.dvegasa</groupId>
  <artifactId>arcpointer</artifactId>
  <version>1.0.2</version>
  <type>pom</type>
</dependency>
```
### Step 2
XML:
```XML
<io.github.dvegasa.arcpointer.ArcPointer
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:radius="150dp"
        android:padding="8dp"
        android:id="@+id/arcpointer"/>
```

Java:
```Java
        ArcPointer arcPointer = findViewById(R.id.arcpointer);
        arcPointer.setValue(0.5f);
        arcPointer.setNotches(9);
        [...]
```
![](https://psv4.userapi.com/c848020/u174628862/docs/d5/2cf60bfd9dfd/exclamation-mark.png?extra=Tcm-M9eZIQ5GXRLHIsWhPOz-ZRn5zCtBil8OhXacg89G90xNiQI3dAYhTI32rpHQbKvrdLODhgMcBUOuHis0CyQ_4XdRJwHHJbDh0IgkHqqjAtP_8OuJIorB67l4Noi_FDldYpP41072X50)
`android:layout_width` and `android:layout_height` should be set `"wrap_content"`. To specify the size of View, use the `radius`.
## Documentation

### Definitions
![](https://pp.userapi.com/c846417/v846417961/6c8e5/Rtb-ayTi1Sw.jpg)
![](https://pp.userapi.com/c846417/v846417603/6c15c/Jh22zSkwV2I.jpg)

![](https://pp.userapi.com/c846417/v846417603/6c144/7OWqYURC7IY.jpg)

### XML attributes and Java methods
**radius** (dp)
`int getRadius()` 
`void setRadius(int radius)`

The radius of arc

---
**value** (float)
`float getValue()` 
`void setValue(float value)`

The pointer positon. Value is a float between 0 and 1 (see image above for more understanding)
```
     0f = left border
   0.5f = mid of arc
     1f = right border
```
---
**workAngle** (int) *[degrees]*
`int getWorkAngle()`
`void setWorkAngle(int workAngle)`

The value of the angle of the arch in degrees

---
**notches** _(Only Java)_
`float[] getNotches()` 
`void setNotches(int n)`
`void setNotches (float[] notches)`

The position of notches on the arch. 
* If you use `(int n)` overload, the `n` notches will be located evenly
* If you use `(float[] notches)` overload, the notches will be located on the coordinates you specify

`setNotches(new float[]{0.1f, 0.2f, 0.5f});`
![](https://pp.userapi.com/c846417/v846417961/6c9d0/MlwUmDzD4BI.jpg)


`setNotches(3);`
`setValue(0.625f);`
![](https://pp.userapi.com/c846417/v846417603/6c144/7OWqYURC7IY.jpg)

---
**isAnimated** (boolean)
`boolean isAnimated()`
`void setAnimated(boolean animated)`

If true, then the value change occurs with animation.

---
**animationVelocity** (int in XML)
`long getAnimationVelocity()`
`void setAnimationVelocity(long animationVelocity)`

Animation speed. The smaller, the faster. Default value is  1500L

{!} Calling `setAnimationVelocity` doesn't cause the redraw of View

---
**lineLengthRatio** (float)
`float getLineLengthRatio()`
`void setLineLengthRatio(float lineLengthRatio)`

Indicates the length of the line relative to the radius of the arc.
> lineLength = radius * lineLengthRatio

---
**lineStrokeWidth** (float)
`float getLineStrokeWidth()`
`void setLineStrokeWidth(float lineStrokeWidth)`

Line width. Default value is 2f

---
**markerLengthRatio** (float)
`float getMarkerLengthRatio()`
`void setMarkerLengthRatio(float markerLengthRatio)`

Indicates the length of the marker **relative to the length of line**

---
**markerStrokeWidth** (float)
`float getMarkerStrokeWidth()`
`void setMarkerStrokeWidth(float markerStrokeWidth)`

Marker width. Default value is 3f

---
~~**notchesLengthRatio**~~ (float)
*Use ```setNotchesLengthRatio``` instead*
`float getNotchLengthRatio()`
`void setNotchLengthRatio(float notchLengthRatio);`

Indicates the length of the notch relative to the radius of arc

---
~~**notchStrokeWidth**~~ (float)
*Use ```setNotchesStrokeWidth``` instead*
`float getNotchStrokeWidth()`
`void setNotchStrokeWidth(float notchStrokeWidth)`

Notch width. Default value is 1.5f

---
**colorBackground** (int)
`int getColorBackground()`
`void setColorBackground(int colorBackground)`

Color of the background

---
**colorLine** (int)
`int getColorLine()`
`void setColorLine(int colorLine)`

Color of the line

---
**colorMarker** (int)
`int getColorMarker()`
`void setColorMarker(int colorMarker)`

Color of the marker

---
~~**colorNotches**~~ (int)
*Use ```setNotchesColors``` instead*
`int getColorNotches()`
`void setColorNotches(int colorNotches)`

Color of the notches

---
**notchesColors** (only Java)
`int[] getNotchesColors()`
`void setNotchesColors(int color)`
`void setNotchesColors(int[] colors)`

Color of the notches.

Overload `(int color)` will set color for all notches

Overload `(int[] colors)` will set colors[i] color to notch[i]

---
**notchesLengthRatio**
`float[] getNotchesLengthRatio()`
`void setNotchesLengthRatio(float ratio)`
`void setNotchesLengthRatio(float[] ratios)`

Indicates the length of the notch relative to the radius of arc

Overload `(float ratio)` will set length ratio for all notches.

Overload `(float[] ratios)` will set ratio[i] length ratio to notch[i]

---
**notchesStrokeWidth**
`float[] getNotchesStrokeWidth()`
`void setNotchesStrokeWidth(float stroke)`
`void setNotchesStrokeWidth(float[] stroke)`

Notch width. Default value is 1.5f

Overload `(float stroke)` will set stroke width for all notches.

Overload `(float[] stroke)` will set stroke[i] stroke width to notch[i]

---
## ChangeLog
### 1.0.2
*27 June, 2018*

* Added customization of single notch:
    * Individual length
    * Individual color
    * Individual strokeWidth
* Old methods for working with notches have become deprecated
> [Sample java class with 1.0.2 features](https://github.com/DVegasa/ArcPointer/blob/master/sample/src/main/java/io/github/dvegasa/arcpointer_sample/ReleaseFeaturesSamples/v1_0_2.java)

### 1.0.1
*June, 2018*

Bug fix

### 1.0.0
*June, 2018*

Release

---
## LICENSE
```
   Copyright 2018 Eduard Khalturin

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
