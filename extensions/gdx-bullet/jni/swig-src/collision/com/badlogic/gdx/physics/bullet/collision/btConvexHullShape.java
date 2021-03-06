/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConvexHullShape extends btPolyhedralConvexAabbCachingShape {
	private long swigCPtr;
	
	protected btConvexHullShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btConvexHullShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexHullShape, normally you should not need this constructor it's intended for low-level usage. */
	public btConvexHullShape(long cPtr, boolean cMemoryOwn) {
		this("btConvexHullShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btConvexHullShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConvexHullShape obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btConvexHullShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static private long SwigConstructbtConvexHullShape(java.nio.FloatBuffer points, int numPoints, int stride) {
    assert points.isDirect() : "Buffer must be allocated direct.";
    return CollisionJNI.new_btConvexHullShape__SWIG_0(points, numPoints, stride);
  }

  public btConvexHullShape(java.nio.FloatBuffer points, int numPoints, int stride) {
    this(btConvexHullShape.SwigConstructbtConvexHullShape(points, numPoints, stride), true);
  }

  static private long SwigConstructbtConvexHullShape(java.nio.FloatBuffer points, int numPoints) {
    assert points.isDirect() : "Buffer must be allocated direct.";
    return CollisionJNI.new_btConvexHullShape__SWIG_1(points, numPoints);
  }

  public btConvexHullShape(java.nio.FloatBuffer points, int numPoints) {
    this(btConvexHullShape.SwigConstructbtConvexHullShape(points, numPoints), true);
  }

  static private long SwigConstructbtConvexHullShape(java.nio.FloatBuffer points) {
    assert points.isDirect() : "Buffer must be allocated direct.";
    return CollisionJNI.new_btConvexHullShape__SWIG_2(points);
  }

  public btConvexHullShape(java.nio.FloatBuffer points) {
    this(btConvexHullShape.SwigConstructbtConvexHullShape(points), true);
  }

  public btConvexHullShape() {
    this(CollisionJNI.new_btConvexHullShape__SWIG_3(), true);
  }

  public void addPoint(Vector3 point, boolean recalculateLocalAabb) {
    CollisionJNI.btConvexHullShape_addPoint__SWIG_0(swigCPtr, this, point, recalculateLocalAabb);
  }

  public void addPoint(Vector3 point) {
    CollisionJNI.btConvexHullShape_addPoint__SWIG_1(swigCPtr, this, point);
  }

  public btVector3 getUnscaledPoints() {
    long cPtr = CollisionJNI.btConvexHullShape_getUnscaledPoints__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public btVector3 getPoints() {
    long cPtr = CollisionJNI.btConvexHullShape_getPoints(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public Vector3 getScaledPoint(int i) {
	return CollisionJNI.btConvexHullShape_getScaledPoint(swigCPtr, this, i);
}

  public int getNumPoints() {
    return CollisionJNI.btConvexHullShape_getNumPoints(swigCPtr, this);
  }

  public void project(Matrix4 trans, Vector3 dir, SWIGTYPE_p_float minProj, SWIGTYPE_p_float maxProj, Vector3 witnesPtMin, Vector3 witnesPtMax) {
    CollisionJNI.btConvexHullShape_project(swigCPtr, this, trans, dir, SWIGTYPE_p_float.getCPtr(minProj), SWIGTYPE_p_float.getCPtr(maxProj), witnesPtMin, witnesPtMax);
  }

  public btConvexHullShape(btShapeHull hull) {
    this(CollisionJNI.new_btConvexHullShape__SWIG_4(btShapeHull.getCPtr(hull), hull), true);
  }

}
