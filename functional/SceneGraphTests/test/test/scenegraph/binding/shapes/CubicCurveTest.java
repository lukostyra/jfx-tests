/*
 * Copyright (c) 2009, 2023, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 */
package test.scenegraph.binding.shapes;

import org.junit.BeforeClass;
import org.junit.Test;
import test.scenegraph.binding.*;
//
//

public class CubicCurveTest extends BindingTestBase {
    @BeforeClass
    public static void runUI() {
        BindingApp.factory = Factories.CubicCurve;
        BindingApp.main(null);
    }

    public static void main(String[] args) {
        runUI();
    }

    /**
    * This test verifies startX property for shapes.CubicCurve
    */
    @Test
    public void startX() {
        commonTest(NumberConstraints.startX);
    }

    /**
    * This test verifies startY property for shapes.CubicCurve
    */
    @Test
    public void startY() {
        commonTest(NumberConstraints.startY);
    }

    /**
    * This test verifies controlX1 property for shapes.CubicCurve
    */
    @Test
    public void controlX1() {
        commonTest(NumberConstraints.controlX1);
    }

    /**
    * This test verifies controlY1 property for shapes.CubicCurve
    */
    @Test
    public void controlY1() {
        commonTest(NumberConstraints.controlY1);
    }

    /**
    * This test verifies controlX2 property for shapes.CubicCurve
    */
    @Test
    public void controlX2() {
        commonTest(NumberConstraints.controlX2);
    }

    /**
    * This test verifies controlY2 property for shapes.CubicCurve
    */
    @Test
    public void controlY2() {
        commonTest(NumberConstraints.controlY2);
    }

    /**
    * This test verifies endX property for shapes.CubicCurve
    */
    @Test
    public void endX() {
        commonTest(NumberConstraints.endX);
    }

    /**
    * This test verifies endY property for shapes.CubicCurve
    */
    @Test
    public void endY() {
        commonTest(NumberConstraints.endY);
    }

    /**
    * This test verifies strokeType property for shapes.CubicCurve
    */
    @Test
    public void strokeType() {
        commonTest(ObjectConstraints.strokeType);
    }

    /**
    * This test verifies strokeWidth property for shapes.CubicCurve
    */
    @Test
    public void strokeWidth() {
        commonTest(NumberConstraints.strokeWidth);
    }

    /**
    * This test verifies strokeLineJoin property for shapes.CubicCurve
    */
    @Test
    public void strokeLineJoin() {
        commonTest(ObjectConstraints.strokeLineJoin);
    }

    /**
    * This test verifies strokeDashOffset property for shapes.CubicCurve
    */
    @Test
    public void strokeDashOffset() {
        commonTest(NumberConstraints.strokeDashOffset);
    }

    /**
    * This test verifies fill property for shapes.CubicCurve
    */
    @Test
    public void fill() {
        commonTest(ObjectConstraints.fill);
    }

    /**
    * This test verifies stroke property for shapes.CubicCurve
    */
    @Test
    public void stroke() {
        commonTest(ObjectConstraints.stroke);
    }

    /**
    * This test verifies opacity property for shapes.CubicCurve
    */
    @Test
    public void opacity() {
        commonTest(NumberConstraints.opacity);
    }

    /**
    * This test verifies blendMode property for shapes.CubicCurve
    */
    @Test
    public void blendMode() {
        commonTest(ObjectConstraints.blendMode);
    }

    /**
    * This test verifies clip property for shapes.CubicCurve
    */
    @Test
    public void clip() {
        commonTest(ObjectConstraints.clip);
    }

    /**
    * This test verifies effect property for shapes.CubicCurve
    */
    @Test
    public void effect() {
        commonTest(ObjectConstraints.effect);
    }

    /**
    * This test verifies layoutX property for shapes.CubicCurve
    */
    @Test
    public void layoutX() {
        commonTest(NumberConstraints.layoutX);
    }

    /**
    * This test verifies layoutY property for shapes.CubicCurve
    */
    @Test
    public void layoutY() {
        commonTest(NumberConstraints.layoutY);
    }

    /**
    * This test verifies translateX property for shapes.CubicCurve
    */
    @Test
    public void translateX() {
        commonTest(NumberConstraints.translateX);
    }

    /**
    * This test verifies translateY property for shapes.CubicCurve
    */
    @Test
    public void translateY() {
        commonTest(NumberConstraints.translateY);
    }

    /**
    * This test verifies scaleX property for shapes.CubicCurve
    */
    @Test
    public void scaleX() {
        commonTest(NumberConstraints.scaleX);
    }

    /**
    * This test verifies scaleY property for shapes.CubicCurve
    */
    @Test
    public void scaleY() {
        commonTest(NumberConstraints.scaleY);
    }

    /**
    * This test verifies rotate property for shapes.CubicCurve
    */
    @Test
    public void rotate() {
        commonTest(NumberConstraints.rotate);
    }

}
