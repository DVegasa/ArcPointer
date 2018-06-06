
# ArcPointer
![](https://vk.com/doc174628862_466937961?hash=5ff37f4446a8c66e81&dl=005e47850c0c112032&wnd=1)
## Demo
![enter image description here](https://vk.com/doc174628862_466937974?hash=f3c304ca19c6e7cccf&dl=4b52fdde339d7dd313&wnd=1)
## Quick start

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
**notchesLengthRatio** (float)
`float getNotchLengthRatio()`
`void setNotchLengthRatio(float notchLengthRatio);`

Indicates the length of the notch relative to the radius of arc

---
**notchStrokeWidth** (float)
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
**colorNotches** (int)
`int getColorNotches()`
`void setColorNotches(int colorNotches)`

Color of the notches


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
