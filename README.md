[![](https://jitpack.io/v/niraj-prajapati/FaceView.svg)](https://jitpack.io/#niraj-prajapati/FaceView)

<!-- wp:group -->
<div class="wp-block-group"><div class="wp-block-group__inner-container"><!-- wp:html -->
<h2>Introduction</h2>
<!-- /wp:html --></div></div>
<!-- /wp:group -->

<!-- wp:paragraph -->
<p>FaceView is zoom library to face for Android made using Google Vision Library.</p>
<!-- /wp:paragraph -->

<!-- wp:more -->
<!--more-->
<!-- /wp:more -->

<!-- wp:image {"id":209,"width":342,"height":741,"sizeSlug":"large"} -->
<figure class="wp-block-image size-large is-resized"><img src="https://nandroidex.files.wordpress.com/2020/03/1585323433986.png?w=473" alt="" class="wp-image-209" width="342" height="741"/></figure>
<!-- /wp:image -->

<!-- wp:heading {"level":1} -->
<h1>How to get?</h1>
<!-- /wp:heading -->

<!-- wp:heading {"level":3} -->
<h3>Step 1.</h3>
<!-- /wp:heading -->

<!-- wp:paragraph -->
<p>Add the JitPack repository to your build file<br>Add it in your root build.gradle at the end of repositories:</p>
<!-- /wp:paragraph -->

<!-- wp:syntaxhighlighter/code -->
<pre class="wp-block-syntaxhighlighter-code">allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}</pre>
<!-- /wp:syntaxhighlighter/code -->

<!-- wp:heading {"level":3} -->
<h3>Step 2.</h3>
<!-- /wp:heading -->

<!-- wp:paragraph -->
<p>Add the dependency</p>

<!-- /wp:paragraph -->

<!-- wp:syntaxhighlighter/code -->
<pre class="wp-block-syntaxhighlighter-code">dependencies {
    implementation 'com.github.niraj-prajapati:FaceView:1.1.0'
}</pre>
<!-- /wp:syntaxhighlighter/code -->

<!-- wp:heading {"level":1} -->
<h1>How to use it?</h1>
<!-- /wp:heading -->

<!-- wp:heading {"level":3} -->
<h3>XML</h3>
<!-- /wp:heading -->

<!-- wp:syntaxhighlighter/code -->
<pre class="wp-block-syntaxhighlighter-code">&lt;com.nandroidex.faceview.FaceView
    android:id="@+id/fvFace"
    android:layout_width="150dp"
    android:layout_height="150dp"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent" /></pre>
<!-- /wp:syntaxhighlighter/code -->

<!-- wp:syntaxhighlighter/code -->
<pre class="wp-block-syntaxhighlighter-code">&lt;com.nandroidex.faceview.CircularFaceView
    android:id="@+id/fvFace"
    android:layout_width="150dp"
    android:layout_height="150dp"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent" /></pre>
<!-- /wp:syntaxhighlighter/code -->

<!-- wp:heading -->
<h2>Params</h2>
<!-- /wp:heading -->

<!-- wp:table {"className":"is-style-regular"} -->
<figure class="wp-block-table is-style-regular"><table><thead><tr><th>Params</th><th>Value</th></tr></thead><tbody><tr><td>app:face_elevation</td><td>int</td></tr></tbody></table></figure>
<!-- /wp:table -->

<!-- wp:heading -->
<h2>Kotlin</h2>
<!-- /wp:heading -->

<!-- wp:syntaxhighlighter/code -->
<pre class="wp-block-syntaxhighlighter-code">fvFace.setImageResource(R.drawable.rock)
//or
fvFace.setImageResource(R.drawable.rock)
//or
fvFace.setImageDrawable(ActivityCompat.getDrawable(this, R.drawable.rock))
//or
fvFace.setImageBitmap(BitmapFactory.decodeResource(resources,R.drawable.rock))
//or
Glide.with(this).load(R.drawable.rock).into(fvFace)</pre>
<!-- /wp:syntaxhighlighter/code -->

<!-- wp:quote -->
<blockquote class="wp-block-quote"><p><strong>do not use android:src="image", use on your code.</strong></p></blockquote>
<!-- /wp:quote -->

<!-- wp:heading {"level":3} -->
<h3>Your contributions are welcome.<a href="https://github.com/NAndroidEx/TextIcon#under-development"></a></h3>
<!-- /wp:heading -->

<!-- wp:heading -->
<h2 id="4054">Demo App</h2>
<!-- /wp:heading -->

<!-- wp:paragraph -->
<p>I have prepared a <a href="https://github.com/NAndroidEx/FaceView" target="_blank" rel="noreferrer noopener">Demo App</a> for you.</p>
<!-- /wp:paragraph -->
