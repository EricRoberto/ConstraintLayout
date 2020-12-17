# ConstraintLayout

A ConstraintLayout is a ViewGroup that allows you to position and size the layout's child views in a flexible way.
In a ConstraintLayout, each view's position is defined using at least one horizontal constraint, and at least one vertical constraint*.*
A constraint connects or aligns a view to another UI element, to the parent layout, or to an invisible guideline.
Advantages of using ConstraintLayout:

You can make a ConstraintLayout responsive to devices that have different screen sizes and resolutions.
ConstraintLayout usually results in a flatter view hierarchy than LinearLayout.
The design editor and the view inspector in Android Studio help you add and configure constraints.
Chains:

A chain is a group of views that are linked to each other with bidirectional constraints.
The views within a chain can be distributed either vertically or horizontally.
Design-time attributes:

Design-time attributes are used and applied only during the layout design, not at runtime. When you run the app, design-time attributes are ignored.
Design-time attributes are prefixed with the tools namespace. For example, the tools:layout_editor_absoluteY and tools:text attributes are design-time attributes.
Baseline constraints:

A baseline constraint aligns a view's text baseline to the text baseline of another view that has text.
Baseline constraints are helpful when views have different font sizes.
