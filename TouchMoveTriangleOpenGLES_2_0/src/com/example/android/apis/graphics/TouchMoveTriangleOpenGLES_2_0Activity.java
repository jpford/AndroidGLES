package com.example.android.apis.graphics;

import android.app.Activity;
import android.os.Bundle;
import android.opengl.GLSurfaceView;
/**
 * 
 * @author J.P. Ford
 *
 * This Android Activity implements a GLSurfaceView for drawing on the screen.
 * GLSurfaceView is the main view-type for applications that use OpenGL
 */

public class TouchMoveTriangleOpenGLES_2_0Activity extends Activity {

    private GLSurfaceView mGLView;
  
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity
        mGLView = new TouchMoveTriangleOpenGLES_2_0SurfaceView(this);
        setContentView(mGLView);
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        // The following call pauses the rendering thread.
        // If your OpenGL application is memory intensive,
        // you should consider de-allocating objects that
        // consume significant memory here.
        mGLView.onPause();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        // The following call resumes a paused rendering thread.
        // If you de-allocated graphic objects for onPause()
        // this is a good place to re-allocate them.
        mGLView.onResume();
    }
}